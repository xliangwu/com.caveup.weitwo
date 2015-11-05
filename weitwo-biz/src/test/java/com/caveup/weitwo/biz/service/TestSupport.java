package com.caveup.weitwo.biz.service;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * 
 * @author xw80329 上午12:14:17
 */
@ContextConfiguration(locations = { "classpath*:bean/applicationContext-*.xml" })
public class TestSupport extends AbstractJUnit4SpringContextTests {

    protected long startTime;
    protected long endTime;

    @Test
    public void test() {

    }

    /**
     * 记录 开始运行时间
     *
     * @return
     */
    protected long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }

    /**
     * 记录 结束运行时间
     *
     * @return
     */
    protected long end() {
        this.endTime = System.currentTimeMillis();
        this.log();
        return endTime;
    }

    /**
     * 输出记录
     */
    protected void log() {
        String text = "\n开始时间 : " + this.startTime + "\n结束时间 : " + this.endTime + "\n执行时间 : "
                + (this.endTime - this.startTime);
        logger.info(text);
    }
}