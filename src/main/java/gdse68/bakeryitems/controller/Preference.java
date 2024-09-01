package gdse68.bakeryitems.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Preference {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String currentPreference;
        private String previousPreferences;

        // Constructors, getters, setters, etc.

        public void updatePreference(String newPreference) {
            if (previousPreferences == null) {
                previousPreferences = "";
            }
            previousPreferences += currentPreference != null ? currentPreference + ";" : "";
            currentPreference = newPreference;
        }
    }


