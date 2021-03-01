package commonLog.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h3>commonLog</h3>
 * <p>
 * 建议日志使用带有占位符的输入,例如:
 * <blockquote>
 * <pre>
 *         logger.info("这是一个日志测试[{}]",para)
 *     </pre>
 * </blockquote>
 *
 * @author : ck
 * @date : 2020-07-22 16:17
 **/
public class CommonLogUtil {
    private static Map<Class, Logger> loggerHashMap = new ConcurrentHashMap();

    /**
     * 缓存创建{@code logger}
     */
    private static Logger gainLogger() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        Class clazz = null;
        try {
            clazz = Class.forName(stackTraceElement[stackTraceElement.length - 2].getClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return getLogger(clazz);
    }

    private static Logger createLogger(Class clazz) {
        return getLogger(clazz);
    }

    private static Logger getLogger(Class clazz) {
        Logger logger;
        synchronized (clazz) {
            if (!loggerHashMap.containsKey(clazz)) {
                logger = LoggerFactory.getLogger(clazz);
                loggerHashMap.put(clazz, logger);
            } else {
                logger=loggerHashMap.get(clazz);
            }
        }
        return logger;
    }

    /**
     * 异常时处理
     *
     * @param throwable
     */
    public static void outException(Throwable throwable) {
        Logger logger = gainLogger();
        logger.error(errorInfoToString(throwable), throwable);
    }

    /**
     * 指定日志对象
     *
     * @param throwable
     * @param clazz
     */
    public static void outException(Class clazz, Throwable throwable) {
        Logger logger = createLogger(clazz);
        logger.error(errorInfoToString(throwable), throwable);
    }

    /**
     * @param info 一般信息
     * @param args 输出占位符参数
     */
    public static void outNormalInfo(String info, Object... args) {
        Logger logger = gainLogger();
        logger.info(info, args);
    }

    public static void outNormalInfo(Class clazz, String info, Object... args) {
        Logger logger = createLogger(clazz);
        logger.info(info, args);
    }

    /**
     * @param info
     * @param args
     */
    public static void outNormalDebug(String info, Object... args) {
        Logger logger = gainLogger();
        if (logger.isDebugEnabled()) {
            logger.debug(info, args);
        }
    }

    public static void outNormalDebug(Class clazz, String info, Object... args) {
        Logger logger = createLogger(clazz);
        if (logger.isDebugEnabled()) {
            logger.debug(info, args);
        }
    }

    /**
     * Exception出错的栈信息转成字符串
     * 用于打印到日志中
     */
    public static String errorInfoToString(Throwable e) {
        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            // 将出错的栈信息输出到printWriter中
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
        } finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (pw != null) {
                pw.close();
            }
        }
        return sw.toString();
    }
}
