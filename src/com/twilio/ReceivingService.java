package com.twilio;

import com.twilio.sdk.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;

public class ReceivingService {
	
	// Find your Account Sid and Token at twilio.com/user/account
	public static final String ACCOUNT_SID = "AC09b34d194921b4d7fbdebce89575a6bb";
	public static final String AUTH_TOKEN = "5945315ca88d07c9670c04173a2d96e5";

	public static void main(String[] args) throws TwilioRestException, InterruptedException {
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		
		int currMessages = 0;
		MessageList messages = client.getAccount().getMessages();
		for (Message message : messages) {
			currMessages++;
		}
		
		while (true) {
			MessageList newMessages = client.getAccount().getMessages();
			for (Message message : newMessages);
			int numOfMessages = newMessages.getEnd() + 1;
			if (numOfMessages > currMessages) {
				for (Message message : newMessages) {
					if (numOfMessages == currMessages)
						break;
					currMessages++;
					
					// Process messages here
					System.out.println(message.getBody());	
				}
			}
			
			Thread.sleep(5000);
		}
	}
}