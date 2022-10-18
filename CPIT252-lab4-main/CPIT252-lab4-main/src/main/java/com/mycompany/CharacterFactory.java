
package com.mycompany;

public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or
    // Knight) by its name:

    public static Characters createCharacter(CharacterTypes type, String name) {
        if (type == null) {
            return null;
        }

        if (type.toString().equalsIgnoreCase("Archer")) {
            return new Archer(name);
        } else if (type.toString().equalsIgnoreCase("Flag_Bearer")) {
            return new FlagBearer(name);
        } else if (type.toString().equalsIgnoreCase("Knight")) {
            return new Knight(name);
        }

        return null;
    }
}
