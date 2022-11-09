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
public class CSVFormatter extends FormatDecorator {
	public CSVFormatter(BaseLogger logger) {
		this.logger = logger;
	}

	public String getLabel() {
		return logger.getLabel() + ", CSVFormatter";
	}

	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
