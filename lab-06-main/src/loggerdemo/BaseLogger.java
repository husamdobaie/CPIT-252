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
public abstract class BaseLogger {
	String label = "Unknown label";
  
	public String getLabel() {
		return label;
	}
        
	public abstract String getLevel();
}
