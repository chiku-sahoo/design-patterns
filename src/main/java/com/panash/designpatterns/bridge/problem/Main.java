package com.panash.designpatterns.bridge.problem;

public class Main {

/*
 * 
 * 	RemoteControl
 * 		SonyRemoteControl
 * 		SamsungRemoteControl
 * 		AdvancedRemoteControl
 * 			SonyAdvancedRemoteControl
 * 			SamsungAdvancedRemoteControl
 * 
 * 	
 * This hierarchy leads to class proliferation.
 * The hierarchy can grow in 2 dimensions - feature(remote type) and implementation(TV brands).
 * Tomorrow if a new remote type is introduced, for e.g. MovieRemoteControl then we need to add 2 new classes
 * from Sony and Samsung to support MovieRemoteControl.
 * Similarly if a new brand is introduced then we need add number of remote controls equal to types.
 * 
 * This problem can be solved using bridge pattern because we can clearly see two different hierarchies.
 * 
 * RemoteControl(BaseClass) --------------------------------------->  Device(Inteface)
 * 
 * 	AdvancedRemoteControl(extends RemoteControl)						SonyTV
 * 																		SamsungTV		
 * 
 * 
 */ 
	
	
}
