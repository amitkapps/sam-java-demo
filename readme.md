# sam-java-demo

## Simple java lambda
1. `sam init`
2. `sam deploy --guided --profile matsonlabs`
3. `curl https://<api-id>.execute-api.us-west-2.amazonaws.com/Prod/hello/`
4. watch the logs 
   1. `sam logs --stack-name sam-java-demo --profile matsonlabs --region us-west-2 --tail`
5. Code changes for accepting a simple request param and echoing it back
6. hot deploy/ sam sync/watch
   1. `sam sync --watch --profile matsonlabs --region us-west-2`
6. deploy again and watch the logs

