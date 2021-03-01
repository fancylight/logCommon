package commonLog.ws.monitor;


/**
 * 系统监控信息Vo
 */
public class MonitorVo {
    private String os;//操作系统
    private String runTime;//程序启动时间
    private String jvmJavaVersion;//java版本

    //jvm
    private String jvmHeapInit;//jvm内存的初始大小
    private String jvmHeapMax;//jvm最大可用内存量
    private String jvmHeapUsed;//jvm已使用的内存量
    private String jvmHeapCommitted;//jvm已申请的内存量
    private String jvmNonHeapInit;//jvm内存的初始大小
    private String jvmNonHeapMax;//jvm最大可用内存量
    private String jvmNonHeapUsed;//jvm已使用的内存量
    private String jvmNonHeapCommitted;//jvm已申请的内存量

    //硬件信息
    private String cpuInfo;//CPU信息
    private String cpuUseRate;//CPU使用率
    private String ramTotal;//系统内存总量
    private String ramUsed;//已使用的系统内存量
    private String diskTotal;//系统磁盘总量
    private String diskUsed;//已使用的系统磁盘量

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getJvmJavaVersion() {
        return jvmJavaVersion;
    }

    public void setJvmJavaVersion(String jvmJavaVersion) {
        this.jvmJavaVersion = jvmJavaVersion;
    }

    public String getJvmHeapInit() {
        return jvmHeapInit;
    }

    public void setJvmHeapInit(String jvmHeapInit) {
        this.jvmHeapInit = jvmHeapInit;
    }

    public String getJvmHeapMax() {
        return jvmHeapMax;
    }

    public void setJvmHeapMax(String jvmHeapMax) {
        this.jvmHeapMax = jvmHeapMax;
    }

    public String getJvmHeapUsed() {
        return jvmHeapUsed;
    }

    public void setJvmHeapUsed(String jvmHeapUsed) {
        this.jvmHeapUsed = jvmHeapUsed;
    }

    public String getJvmHeapCommitted() {
        return jvmHeapCommitted;
    }

    public void setJvmHeapCommitted(String jvmHeapCommitted) {
        this.jvmHeapCommitted = jvmHeapCommitted;
    }

    public String getJvmNonHeapInit() {
        return jvmNonHeapInit;
    }

    public void setJvmNonHeapInit(String jvmNonHeapInit) {
        this.jvmNonHeapInit = jvmNonHeapInit;
    }

    public String getJvmNonHeapMax() {
        return jvmNonHeapMax;
    }

    public void setJvmNonHeapMax(String jvmNonHeapMax) {
        this.jvmNonHeapMax = jvmNonHeapMax;
    }

    public String getJvmNonHeapUsed() {
        return jvmNonHeapUsed;
    }

    public void setJvmNonHeapUsed(String jvmNonHeapUsed) {
        this.jvmNonHeapUsed = jvmNonHeapUsed;
    }

    public String getJvmNonHeapCommitted() {
        return jvmNonHeapCommitted;
    }

    public void setJvmNonHeapCommitted(String jvmNonHeapCommitted) {
        this.jvmNonHeapCommitted = jvmNonHeapCommitted;
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public String getCpuUseRate() {
        return cpuUseRate;
    }

    public void setCpuUseRate(String cpuUseRate) {
        this.cpuUseRate = cpuUseRate;
    }

    public String getRamTotal() {
        return ramTotal;
    }

    public void setRamTotal(String ramTotal) {
        this.ramTotal = ramTotal;
    }

    public String getRamUsed() {
        return ramUsed;
    }

    public void setRamUsed(String ramUsed) {
        this.ramUsed = ramUsed;
    }

    public String getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(String diskTotal) {
        this.diskTotal = diskTotal;
    }

    public String getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(String diskUsed) {
        this.diskUsed = diskUsed;
    }
}
