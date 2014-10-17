package camelcoredemo;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;
import org.apache.camel.impl.DefaultCamelContext;

import org.apache.camel.ProducerTemplate;

public class CamelIntroMain extends Main {
	
	public static void main(String[] args) throws Exception{
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(createRouteBuilder());
		camelContext.start();
		//
		ProducerTemplate tpl = camelContext.createProducerTemplate();
		tpl.sendBodyAndHeader("direct:start","<introduction>Camel</introduction>","name", "Rademakers");
		tpl.sendBodyAndHeader("direct:start","<introduction>Mule</introduction>","name", "Rademakers");
		camelContext.stop();
	}
	
	static RouteBuilder createRouteBuilder(){
		return new CamelIntroRoute();
	}
}
