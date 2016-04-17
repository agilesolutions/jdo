package com.agilesolutions.jboss.util;

import static org.reflections.ReflectionUtils.withAnnotation;
import static org.reflections.ReflectionUtils.withModifier;
import static org.reflections.ReflectionUtils.withPrefix;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import com.agilesolutions.jboss.annotations.Attribute;
import com.agilesolutions.jboss.annotations.Component;
import com.agilesolutions.jboss.annotations.Root;
import com.agilesolutions.jboss.annotations.GUIType;

/**
 * read https://code.google.com/p/reflections/
 * 
 * @author Carol
 *
 */
public class Reflect {

	
	@SuppressWarnings("unchecked")
	public static List<Method> getAggregateMethods(Class<?> someClass) {

		return ReflectionUtils.getAllMethods(someClass, withModifier(Modifier.PUBLIC), withPrefix("get"), withAnnotation(Component.class))
		                .stream().sorted(new Comparator<Method>() {
			                public int compare(Method o1, Method o2) {
				                Attribute or1 = o1.getAnnotation(Attribute.class);
				                Attribute or2 = o2.getAnnotation(Attribute.class);
				                if (or1 != null && or2 != null) {
					                return or1.order() - or2.order();
				                } else if (or1 != null && or2 == null) {
					                return -1;
				                } else if (or1 == null && or2 != null) {
					                return 1;
				                }
				                return o1.getName().compareTo(o2.getName());
			                }
		                }).collect(Collectors.toList());

	}
	


	@SuppressWarnings("unchecked")
	public static List<Method> getAttributes(Class<?> someClass) {

		return ReflectionUtils.getAllMethods(someClass, withModifier(Modifier.PUBLIC), withPrefix("get"), withAnnotation(Attribute.class))
		                .stream().sorted(new Comparator<Method>() {
			                public int compare(Method o1, Method o2) {
				                Attribute or1 = o1.getAnnotation(Attribute.class);
				                Attribute or2 = o2.getAnnotation(Attribute.class);
				                if (or1 != null && or2 != null) {
					                return or1.order() - or2.order();
				                } else if (or1 != null && or2 == null) {
					                return -1;
				                } else if (or1 == null && or2 != null) {
					                return 1;
				                }
				                return o1.getName().compareTo(o2.getName());
			                }
		                }).collect(Collectors.toList());

	}

	public static GUIType getType(Method someMethod) {

		return someMethod.getAnnotation(Attribute.class).type();

	}

	public static int getLength(Method someMethod) {

		return someMethod.getAnnotation(Attribute.class).length();

	}

	public static Class<?> getRoot() {
		
		Reflections reflections = new Reflections("com.agilesolutions.jboss.model");

		return reflections.getTypesAnnotatedWith(Root.class).stream().collect(Collectors.toList()).get(0);

	}

	/**
	 *  get all collection container components, like datasources, deployments and so on.
	 * @param someClass
	 * @return
	 */
	public static List<Method> getComponents(Class<?> someClass) {
		
		System.out.println("");

		return ReflectionUtils.getAllMethods(someClass, withModifier(Modifier.PUBLIC), withPrefix("get"), withAnnotation(Component.class)).stream().sorted(new Comparator<Method>() {
			public int compare(Method o1, Method o2) {
				Component or1 = o1.getAnnotation(Component.class);
				Component or2 = o2.getAnnotation(Component.class);
				if (or1 != null && or2 != null) {
					return or1.order() - or2.order();
				} else if (or1 != null && or2 == null) {
					return -1;
				} else if (or1 == null && or2 != null) {
					return 1;
				}
				return o1.getName().compareTo(o2.getName());
			}
		}).collect(Collectors.toList());

	}

}
