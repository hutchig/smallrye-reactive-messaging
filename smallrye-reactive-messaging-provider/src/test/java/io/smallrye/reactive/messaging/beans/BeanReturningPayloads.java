package io.smallrye.reactive.messaging.beans;

import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.eclipse.microprofile.reactive.streams.operators.ReactiveStreams;
import org.reactivestreams.Publisher;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class BeanReturningPayloads {

  private AtomicInteger count = new AtomicInteger();

  @Outgoing("infinite-producer")
  public int create() {
    return count.incrementAndGet();
  }

}
