/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loggerdemo;

/**
 *
 * @author asomy
 */
public class YAMLFormatter extends FormatDecorator {
	public YAMLFormatter(BaseLogger logger) {
		this.logger = logger;
	}

	public String getLabel() {
		return logger.getLabel() + ", YAMLFormatter";
	}

	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}