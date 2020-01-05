# Spring Integration & Dynamodb Streams demo

By default, two Dynamodb tables will be created (`SpringIntegrationLockRegistry` and `SpringIntegrationMetadataStore`).
This can be configured.

## References

* [Spring Integration AWS](https://github.com/spring-projects/spring-integration-aws)
* [Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/)
* [Spring Cloud Stream Binder AWS Kinesis](https://github.com/spring-cloud/spring-cloud-stream-binder-aws-kinesis)
* Necessary but still unreleased bugfix: https://github.com/spring-cloud/spring-cloud-stream-binder-aws-kinesis/issues/118
* Recent announcements: https://spring.io/blog/2019/05/13/spring-integration-aws-2-2-ga-and-spring-cloud-stream-kinesis-binder-1-2-ga-available