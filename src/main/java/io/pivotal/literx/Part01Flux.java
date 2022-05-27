package io.pivotal.literx;

import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

    // TODO Return an empty Flux
    Flux<String> emptyFlux() {
        System.out.println(Flux.empty());
        return Flux.empty();  // No devuelve nada, en el text solo saldra FluxEmpty
    }

//========================================================================================

    /**
     * TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
     * @return : Flux
     * Nota : Si cambiaramos cualquiera de estos dos elementos
     * la prueba saldria mala , ya que la expectactiva es foo y bar
     */
    Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

//========================================================================================

    // TODO Create a Flux from a List that contains 2 values "foo" and "bar"
    Flux<String> fooBarFluxFromList() {
        return Flux.just("foo", "bar");

    }

//========================================================================================

    // TODO Create a Flux that emits an IllegalStateException
    Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }

//========================================================================================

    // TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
    Flux<Long> counter() {
        return Flux
                .interval(Duration.ofMillis(100))
                .take(10);
    }

}
