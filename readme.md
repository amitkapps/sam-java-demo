# sam-java-demo

## Simple java lambda - API
1. `sam init`
2. `sam build`
2. `sam deploy --guided --profile matsonlabs`
3. `curl https://<api-id>.execute-api.us-west-2.amazonaws.com/Prod/hello/`
4. watch the logs 
   1. `sam logs --stack-name sam-java-demo --profile matsonlabs --region us-west-2 --tail`
5. Code changes for accepting a simple request param and echoing it back
6. hot deploy/ sam sync/watch
   1. `sam sync --watch --profile matsonlabs --region us-west-2`
7. deploy again and watch the logs
8. View the resources in the console
   1. Lambda > configuration 

## Simple java lambda - sqs message processor
1. Implement SQS message handler: https://docs.aws.amazon.com/lambda/latest/dg/with-sqs-example.html
2. Add an sqs queue, ref events: https://github.com/aws/serverless-application-model/blob/master/versions/2016-10-31.md#sqs
3. Create a queue and get its ARN
   1. Ref cft: https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html
   2. Where to get the Arn?: https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html
      1. !GetAtt
   3. Let's not name the queue
4. Post message to queue
   1. cli ref:  https://docs.aws.amazon.com/cli/latest/reference/
   2. `aws sqs send-message --profile matsonlabs --queue-url "https://sqs.us-west-2.amazonaws.com/275416279984/sam-java-demo-GreetingMessageQueue-2qIboUSqqs1d" --region us-west-2 --message-body "hello"`

