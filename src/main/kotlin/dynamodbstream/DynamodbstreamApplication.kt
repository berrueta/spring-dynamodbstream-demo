package dynamodbstream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink

@SpringBootApplication
@EnableBinding(Sink::class)
class DynamodbstreamApplication {
	@StreamListener(Sink.INPUT)
	fun processMessage(message: String) {
		println("Received message $message")
	}
}

fun main(args: Array<String>) {
	runApplication<DynamodbstreamApplication>(*args)
}

