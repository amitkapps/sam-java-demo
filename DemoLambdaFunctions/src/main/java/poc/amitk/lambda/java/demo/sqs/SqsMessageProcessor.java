package poc.amitk.lambda.java.demo.sqs;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;

/**
 * Ref: <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs-example.html">...</a>
 * @author amitkapps
 */
public class SqsMessageProcessor implements RequestHandler<SQSEvent, Void> {
    @Override
    public Void handleRequest(SQSEvent sqsEvent, Context context) {
        context.getLogger().log("SQSEvent:");
        context.getLogger().log(String.valueOf(sqsEvent));
        for (SQSEvent.SQSMessage msg : sqsEvent.getRecords()) {
            processMessage(msg, context);
        }
        context.getLogger().log("done");
        return null;
    }

    private void processMessage(SQSEvent.SQSMessage msg, Context context) {
        try {
            context.getLogger().log("Processed message " + msg.getBody());

        } catch (Exception e) {
            context.getLogger().log("An error occurred");
//            throw e;
        }
    }
}
