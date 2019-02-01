package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed id semper risus in hendrerit gravida. Nibh sed pulvinar proin gravida. Lorem ipsum dolor sit amet consectetur adipiscing elit. Ac turpis egestas integer eget aliquet nibh praesent. Ornare aenean euismod elementum nisi quis eleifend. Nunc faucibus a pellentesque sit amet porttitor eget dolor. Ullamcorper sit amet risus nullam eget felis eget. Volutpat diam ut venenatis tellus in metus. Pharetra et ultrices neque ornare aenean euismod elementum nisi quis. Pretium quam vulputate dignissim suspendisse in est ante in nibh. Ac tincidunt vitae semper quis lectus nulla at. Et egestas quis ipsum suspendisse ultrices. Erat nam at lectus urna duis. Sed sed risus pretium quam vulputate dignissim suspendisse. Cras semper auctor neque vitae tempus quam pellentesque nec.\n"
				+ "\n"
				+ "Mauris pharetra et ultrices neque. Magna etiam tempor orci eu lobortis elementum nibh tellus molestie. Lacus viverra vitae congue eu consequat ac felis. Porttitor lacus luctus accumsan tortor posuere ac ut consequat semper. Molestie a iaculis at erat pellentesque. Vestibulum sed arcu non odio euismod lacinia. Varius quam quisque id diam. Facilisi cras fermentum odio eu. Pretium fusce id velit ut tortor pretium viverra suspendisse potenti. Nisl suscipit adipiscing bibendum est ultricies integer quis auctor elit. Scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Eget egestas purus viverra accumsan in. Tincidunt tortor aliquam nulla facilisi cras fermentum odio eu feugiat. Lectus nulla at volutpat diam ut venenatis tellus in metus. Elementum nisi quis eleifend quam adipiscing. A erat nam at lectus. Iaculis at erat pellentesque adipiscing. A iaculis at erat pellentesque adipiscing commodo elit at. Posuere urna nec tincidunt praesent semper feugiat. Nascetur ridiculus mus mauris vitae.\n"
				+ "\n"
				+ "Eget velit aliquet category:apparel sagittis id consectetur purus. Phasellus faucibus scelerisque eleifend donec pretium vulputate sapien nec sagittis. Quis auctor elit sed vulputate. Ipsum dolor sit amet consectetur. Natoque penatibus et magnis dis parturient. Sed faucibus turpis in eu mi bibendum neque egestas. Justo laoreet sit amet cursus sit. Aliquet sagittis id consectetur purus ut. Et malesuada fames ac turpis. Nunc aliquet bibendum enim facilisis gravida neque convallis a cras. Orci phasellus egestas tellus rutrum tellus. Dignissim cras tincidunt lobortis feugiat. Dignissim cras tincidunt lobortis feugiat vivamus at. Egestas egestas fringilla phasellus faucibus scelerisque eleifend. Maecenas ultricies mi eget mauris pharetra et ultrices neque. Aliquam ut porttitor leo a diam. Nisl tincidunt eget nullam non nisi. Neque laoreet suspendisse interdum consectetur libero id. Penatibus et magnis dis parturient montes nascetur ridiculus. Consectetur adipiscing elit pellentesque habitant morbi.\n"
				+ "\n"
				+ "Quis eleifend quam category:furniture adipiscing vitae proin sagittis nisl. Felis eget velit aliquet sagittis id consectetur purus ut faucibus. Aliquam nulla facilisi cras fermentum odio eu feugiat pretium. Libero nunc consequat interdum varius sit amet mattis vulputate enim. Vel orci porta non pulvinar neque laoreet suspendisse. Viverra ipsum nunc aliquet bibendum enim facilisis gravida neque. Tincidunt id aliquet risus feugiat in ante. Ullamcorper malesuada proin libero nunc consequat interdum varius sit. Ipsum faucibus vitae aliquet nec ullamcorper sit. Scelerisque eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada. Quam id leo in vitae turpis. Mauris in aliquam sem fringilla ut morbi tincidunt. Placerat orci nulla pellentesque dignissim. Id porta nibh venenatis cras sed felis eget. Mauris pellentesque pulvinar pellentesque habitant morbi tristique. At risus viverra adipiscing at in tellus integer feugiat. Mauris sit amet massa vitae tortor condimentum.\n"
				+ "\n"
				+ "Quis hendrerit dolor category:makeup magna eget est. Aliquam malesuada bibendum arcu vitae elementum curabitur vitae. Mauris in aliquam sem fringilla ut morbi tincidunt augue. Diam maecenas ultricies mi eget mauris pharetra et. Magna eget est lorem ipsum. Sem nulla pharetra diam sit amet nisl suscipit adipiscing. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Magna fermentum iaculis eu non. Tristique et egestas quis ipsum. Nisl vel pretium lectus quam id leo in vitae. Sit amet nisl suscipit adipiscing. Quam pellentesque nec nam aliquam sem et. Leo in vitae turpis massa sed elementum. Massa tempor nec feugiat nisl pretium fusce id velit ut. Varius morbi enim nunc faucibus a pellentesque.";

		printCategories(str);
	}

	public static void printCategories(String string) {

		int index = 0;

		while (true) {

			int found = string.indexOf("category:", index);
			if (found == -1)
				break;
			int start = found+9;
			int end = string.indexOf(" ", start);
			
			System.out.println(string.substring(start, end));
			index = end+1;
		}

	}

}
