package com.jingrui.jrap.task.log;

import com.jingrui.jrap.task.info.TaskExecuteInfo;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 任务记录日志 输出流.
 *
 * @author peng.jiang@jingrui.com
 * @date 2017/11/28
 **/
public class TaskOutputStream extends OutputStream {

    @Override
    public void write(int b) throws IOException {
        System.out.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        String res = new String(b,"UTF-8");
        TaskExecuteInfo.TASK_LOG.get().append(res);
    }
}
