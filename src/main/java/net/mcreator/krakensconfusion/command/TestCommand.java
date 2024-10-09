
package net.mcreator.krakensconfusion.command;

@Mod.EventBusSubscriber
public class TestCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("test")

		);
	}

}
