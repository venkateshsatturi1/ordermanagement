package com.example.ordermanagement;

import au.com.dius.pact.core.model.Interaction;
import au.com.dius.pact.core.model.Pact;
import au.com.dius.pact.provider.PactVerifyProvider;
import au.com.dius.pact.provider.junit5.MessageTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.StateChangeAction;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import au.com.dius.pact.provider.junitsupport.loader.PactBrokerAuth;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider("OrderProvider")
//@PactFolder("pacts")
@PactBroker(url="https://expertuts.pactflow.io/",authentication=@PactBrokerAuth(token="Sb7LmG1IMyP3hjaP8XsdVA"))

public class producerTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(producerTests.class);
	
	 @TestTemplate
	  @ExtendWith(PactVerificationInvocationContextProvider.class)
	  void testTemplate(Pact pact, Interaction interaction, PactVerificationContext context) {
	    LOGGER.info("testTemplate called: " + pact.getProvider().getName() + ", " + interaction);
	    context.verifyInteraction();
	  }
	 
	 @BeforeEach
	  void before(PactVerificationContext context) {
	    context.setTarget(new MessageTestTarget());
	    }
	 
 
	   @State(value = "Shipment Service is awaiting order", action=StateChangeAction.SETUP)
		public void shipmentSetUp()
		{
			
		}
		
		@State(value = "Shipment Service is awaiting order", action=StateChangeAction.TEARDOWN)
		public void shipmentTearDown()
		{
			
		}

	  @PactVerifyProvider("Item Order")
	  public String verifyMessageForOrder() {
	    return "{\"orderId\":43546,\"shipperid\":123,\"paymentid\":12345,\"itemNumber\":\"FRE\",\"qty\":10,\"locationId\":2700,\"channel\":\"B2B\"}";
	  }

}
