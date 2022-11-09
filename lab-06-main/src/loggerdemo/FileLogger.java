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
public class FileLogger extends BaseLogger{
    
    	public FileLogger() {
		label = "File logger";
	}
 
	public String getLevel() {
		return "info";
	}
}
