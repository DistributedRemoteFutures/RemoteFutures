/*
 * Copyright (c) 2014 Martin Senne, Marvin Hansen.
 */
package org.remotefutures.proposals.idea_specialized_executioncontext

import scala.concurrent.ExecutionContext

object RemoteAwareExecutionContext {
  def apply() : ExecutionContext = {
    new SimpleAkkaRemoteAwareExecutionContext
  }
}

// IMPLEMENTATION follows below



class SimpleAkkaRemoteAwareExecutionContext extends ExecutionContext {

  // setup the akkabased system

  override def execute(runnable: Runnable): Unit = {
    println("Execute in SimpleAkkaRemoteAwareExecutionContext.")
  }

  override def reportFailure(cause: Throwable): Unit = ???

}