package camelcoredemo;

import org.apache.camel.builder.RouteBuilder;

public class PurchaseOrderRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:sendMail")
		.setHeader("Subject",constant("Thanks for ording"))
		.setHeader("From",constant("donotreplay@riders.com"))
		.to("velocity://rider/mail.vm")
		.to("smtp://mail.riders.com?user=camel&password=secret");
	}

}
