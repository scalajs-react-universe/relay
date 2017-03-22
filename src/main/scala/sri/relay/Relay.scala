package sri.relay

import sri.relay.container.{RelayContainer, RelayContainerSpec, RelayPropTypes}
import sri.relay.mutation.RelayMutation
import sri.relay.network.NetworkLayer
import sri.relay.route.RelayQueryConfig
import sri.core._
import sri.relay.store.RelayEnvironment
import sri.relay.tools.RelayInternalTypes.RelayQuerySet
import sri.relay.tools.RelayTaskScheduler.TaskExecutor

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-relay", JSImport.Namespace)
object Relay extends js.Object {
  val RootContainer: ReactClass = js.native
  val ReadyStateRenderer: ReactClass = js.native
  val Renderer: ReactClass = js.native

  /**
    * Create a component given a specification. A component implements a render method which returns one single child.
    * That child may have an arbitrarily deep child structure. One thing that makes components different than standard
    * prototypal classes is that you don't need to call new on them. They are convenience wrappers that construct
    * backing instances (via new) for you.
    */
  val Mutation: RelayMutation = js.native
  val PropTypes: RelayPropTypes = js.native
  val Route: RelayQueryConfig = js.native
  val Store: RelayEnvironment = js.native

  val Environment: RelayEnvironment = js.native

  def createContainer[C <: RelayClass: js.ConstructorTag](
      component: RelayComponentConstructor { type ComponentType = C },
      spec: RelayContainerSpec): RelayContainer[C] = js.native

  def getQueries[C <: RelayClass](component: RelayContainer[C],
                                  route: RelayQueryConfig): RelayQuerySet =
    js.native

  def injectNetworkLayer(layer: NetworkLayer): Unit = js.native

  def injectTaskScheduler(scheduler: TaskExecutor): Unit = js.native

  def isContainer(component: js.Object): Boolean = js.native

}
