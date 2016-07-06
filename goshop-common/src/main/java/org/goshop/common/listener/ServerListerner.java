package org.goshop.common.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerListerner implements ServletContextListener {
	protected final Log logger =LogFactory.getLog(this.getClass());

	public void contextDestroyed(ServletContextEvent contextEvent) {
	}

	public void contextInitialized(ServletContextEvent contextEvent) {
		logger.info("=================================");
		logger.info("系统[{}]启动完成!!!"+contextEvent.getServletContext().getServletContextName());
		logger.info("=================================");
	}
}