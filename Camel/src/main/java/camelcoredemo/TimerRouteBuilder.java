package camelcoredemo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.Processor;
import org.apache.camel.Exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimerRouteBuilder extends RouteBuilder {
	//Log
	static Logger LOG = LoggerFactory.getLogger(TimerRouteBuilder.class);
	//
	@Override
	public void configure() throws Exception {
		from("timer://timer1?period=1000")
        .process(new Processor() {
            public void process(Exchange msg) {
                LOG.info("Processing {}", msg);
            }
        });
	}

}
