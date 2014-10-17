package camelcoredemo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PurchaseOrderVelocityMain extends Main {
	
static Logger LOG = LoggerFactory.getLogger(PurchaseOrderVelocityMain.class);
	
	public static void main(String[] args) throws Exception{
		PurchaseOrderVelocityMain main = new PurchaseOrderVelocityMain();
		main.enableHangupSupport();
		main.addRouteBuilder(createRouteBuilder());
		main.run();
	}
	
	static RouteBuilder createRouteBuilder(){
		return new PurchaseOrderRouteBuilder();
	}
}
