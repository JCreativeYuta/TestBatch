package rest;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("sample")
public class JBatchResource {

    @GET
    public String start() {
        JobOperator job = BatchRuntime.getJobOperator();

        System.out.println("[REST] バッチ呼び出し前");
        long id = job.start("sample-job", null);
        System.out.println("[REST] バッチ呼び出し後");

        return "jBatch Start. id = " + id;
    }
}
