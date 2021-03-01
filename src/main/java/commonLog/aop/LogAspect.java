package commonLog.aop;

import commonLog.util.CommonLogUtil;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * <h3>commonLog</h3>
 *
 * @author : ck
 * @date : 2020-07-22 17:03
 **/
@Aspect
public class LogAspect {
    @Pointcut("execution(public * test..*.*(..))")
    public void recordMillPointCut() {

    }

    @Around("recordMillPointCut()")
    public void logMill(ProceedingJoinPoint pjp) {
        CommonLogUtil.outNormalInfo(pjp.getSignature().getDeclaringType(), "开始调用函数");
        long now = System.currentTimeMillis();
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        CommonLogUtil.outNormalInfo(pjp.getSignature().getDeclaringType(), "耗时[{}]毫秒", System.currentTimeMillis() - now);
    }

    @Pointcut("execution(public * *..*.*Action(xsf.web.HttpContext,xsf.IContextDictionary))")
    public void xsfActionPointCut() {
    }
        //此处以前是为了在xsf环境下使用,书写的切面
//    @Before(value = "xsfActionPointCut()&&args(httpContext,iContextDictionary)")
//    public void xsfInfoLog(HttpContext httpContext, IContextDictionary iContextDictionary) {
//        CommonLogUtil.outNormalInfo("访问ip:[{}]",httpContext.getRequest().getLocalAddr());
//    }
}
