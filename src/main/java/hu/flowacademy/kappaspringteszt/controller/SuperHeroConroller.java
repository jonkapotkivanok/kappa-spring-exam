package hu.flowacademy.kappaspringteszt.controller;

import hu.flowacademy.kappaspringteszt.entities.SuperHero;
import hu.flowacademy.kappaspringteszt.service.SuperHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
class SuperHeroController {

    @Autowired
    private SuperHeroService superHeroService;

    @PostMapping("/super-hero")
    @ResponseStatus(HttpStatus.CREATED)
    public SuperHero createSuperHero(@RequestBody SuperHero superHero) {
        return superHeroService.createSuperHero(superHero);
    }

    @PutMapping("/super-hero")
    public SuperHero updateSuperHero(@RequestBody SuperHero superHero) {
        return superHeroService.updateSuperHero(superHero);
    }

    @GetMapping("/super-hero")
    public List<SuperHero> getAllSuperHeros() {
        return superHeroService.getAllSuperHeroes();
    }

    @GetMapping("/super-hero/{id}")
    public SuperHero getSuperHero(@PathVariable String id) {
        return superHeroService.getSuperHero(id);
    }
}
