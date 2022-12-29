package com.CrudBoot.web;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.CrudBoot.web.dao.UserRepository;
import com.CrudBoot.web.entities.User;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCrudApplication.class, args);
		UserRepository userrepo = context.getBean(UserRepository.class);
		/*
		 * User user=new User(); user.setName("Quadir"); user.setCity("Srinagar");
		 * user.setStatus(" Developer"); User user2=new User();
		 * user2.setName("J Quadir"); user2.setCity("Sgr");
		 * user2.setStatus(" Developer");
		 * 
		 * List<User> users=List.of(user,user2); Iterable<User> result=
		 * userrepo.saveAll(users); result.forEach(item->{ System.out.println(item); });
		 * System.out.println(users);
		 */
		/*
		 * System.out.println("mmmmmmm..."+userrepo.findById(9)); Optional<User>
		 * opt=userrepo.findById(9); User user=opt.get(); user.setName("salman");
		 * user.setStatus("Java Developer"); userrepo.save(user);
		 * System.out.println(opt);
		 */
		/*
		 * Iterable<User> users = userrepo.findAll();
		 * 
		 * Iterator<User> itr = users.iterator(); while (itr.hasNext()) { User user =
		 * itr.next(); System.out.println(user); }
		 * 
		 * users.forEach(item->{ System.err.println(item); });
		 */

		// Deleting user element
		/*
		 * userrepo.deleteById(11);
		 */
		/*
		 * List<User> users = userrepo.getUserByName("je Quadir"); users.forEach(itm ->
		 * { System.out.println(itm); });
		 * 
		 * System.out.println("___________________________________________");
		 * 
		 * List<User> users1 = userrepo.getUserByNameAndCity("salman", "srinagar");
		 * users1.forEach(itm -> { System.out.println(itm); });
		 * System.out.println("___________________________________________");
		 * 
		 * // Native Queries
		 * 
		 * List<User> users2 = userrepo.getUsers(); users2.forEach(itm -> {
		 * System.out.println(itm); });
		 */
	}

}
