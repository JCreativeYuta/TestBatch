package batchlet;

import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named("MyBatchlet")
public class MyBatchlet implements Batchlet {

    @Override
    public String process() throws Exception {
        System.out.println("[Batchlet] process");
        return null;
    }

    @Override
    public void stop() throws Exception {
        System.out.println("[Batchlet] stop");
    }
}
