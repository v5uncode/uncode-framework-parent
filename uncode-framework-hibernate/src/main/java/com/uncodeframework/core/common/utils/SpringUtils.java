package com.uncodeframework.core.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public final class SpringUtils implements BeanFactoryPostProcessor, ResourceLoaderAware {

	private static ConfigurableListableBeanFactory beanFactory; // Spring应用上下文环境
	private static ResourceLoader resourceLoader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		SpringUtils.resourceLoader = resourceLoader;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		SpringUtils.beanFactory = beanFactory;
	}

	/**
	 * 1. classpath: classpath:com/myapp/config.xml , Loaded from the classpath.
	 * 2. file: file:/data/config.xml Loaded as a URL, from the filesystem. 
	 * 3. http: http://myserver/logo.png Loaded as a URL. 
	 * 4. (none) /data/config.xml ,Depends on the underlying ApplicationContext.
	 * 
	 * @param location
	 * @return
	 */
	public static Resource getResource(String location) {
		return resourceLoader.getResource(location);
	}

	/**
	 * 获取对象
	 * 
	 * @param name
	 * @return Object 一个以所给名字注册的bean的实例
	 * @throws org.springframework.beans.BeansException
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) throws BeansException {
		return (T) beanFactory.getBean(name);
	}

	/**
	 * 获取类型为requiredType的对象
	 * 
	 * @param clz
	 * @return
	 * @throws org.springframework.beans.BeansException
	 * 
	 */
	public static <T> T getBean(Class<T> clz) throws BeansException {
		@SuppressWarnings("unchecked")
		T result = (T) beanFactory.getBean(clz);
		return result;
	}

	/**
	 * 如果BeanFactory包含一个与所给名称匹配的bean定义，则返回true
	 * 
	 * @param name
	 * @return boolean
	 */
	public static boolean containsBean(String name) {
		return beanFactory.containsBean(name);
	}

	/**
	 * 判断以给定名字注册的bean定义是一个singleton还是一个prototype。
	 * 如果与给定名字相应的bean定义没有被找到，将会抛出一个异常（NoSuchBeanDefinitionException）
	 * 
	 * @param name
	 * @return boolean
	 * @throws org.springframework.beans.factory.NoSuchBeanDefinitionException
	 * 
	 */
	public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
		return beanFactory.isSingleton(name);
	}

	/**
	 * @param name
	 * @return Class 注册对象的类型
	 * @throws org.springframework.beans.factory.NoSuchBeanDefinitionException
	 * 
	 */
	public static Class<?> getType(String name) throws NoSuchBeanDefinitionException {
		return beanFactory.getType(name);
	}

	/**
	 * 如果给定的bean名字在bean定义中有别名，则返回这些别名
	 * 
	 * @param name
	 * @return
	 * @throws org.springframework.beans.factory.NoSuchBeanDefinitionException
	 * 
	 */
	public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
		return beanFactory.getAliases(name);
	}

}