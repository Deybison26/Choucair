package co.com.choucair.certification.proyectobase.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;




public class ChoucairAcademyStepDefinitions {
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thatBrandonWantsToLearnAutomationTheAcademyChoucair() {

    }

    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform() {

    }

    @Then("^he finds the coursed called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCoursedCalledResourcesRecursosAutomatizacionBancolombia() {

    }
}