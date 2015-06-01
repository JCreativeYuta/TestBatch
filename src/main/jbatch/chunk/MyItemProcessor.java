package chunk;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

import common.util.TestUtil;

@Dependent
@Named("MyItemProcessor")
public class MyItemProcessor implements ItemProcessor {

	@Inject
	private TestUtil testUtil;

    @Override
    public Object processItem(Object item) throws Exception {
        System.out.println("[Processor] item = " + item);

        String str = testUtil.voidUtil();
        System.out.println(str);

        return ((String)item).toUpperCase();
    }
}
