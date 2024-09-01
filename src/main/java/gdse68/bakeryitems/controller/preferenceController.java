package gdse68.bakeryitems.controller;

import gdse68.bakeryitems.DTO.foodItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/preferences")
public class preferenceController {



        @Autowired
        private foodItemDto foodItemDto;

        @GetMapping("/{id}")
        public Preference getPreference(@PathVariable Long id) {
            return preferenceService.getPreference(id);
        }

        @PutMapping("/{id}")
        public Preference updatePreference(@PathVariable Long id, @RequestParam String newPreference) {
            return preferenceService.updatePreference(id, newPreference);
        }
    }

}
