package test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestSpring {

	@RequestMapping("/TestSpring")
	public void sayHello()
	{
		System.out.println("Hai Spring . . . . .");
	}
}
