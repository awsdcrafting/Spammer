package main;
import io.github.awsdcrafting.KeyListener;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
/**
 * Created by scisneromam on 10.08.2017.
 */
public class Main
{
	public static void main(String[] args)
	{
		//test
		try
		{
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException ex)
		{
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		GlobalScreen.addNativeKeyListener(new KeyListener());
	}
}

