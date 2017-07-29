import React from "react";
import { IndexLink, Link } from "react-router";

export default class Nav extends React.Component {
  constructor() {
    super()
    this.state = {
      collapsed: true,
    };
  }

  toggleCollapse() {
    const collapsed = !this.state.collapsed;
    this.setState({collapsed});
  }

  render() {
    const { location } = this.props;
    const { collapsed } = this.state;
    const loginClass = location.pathname === "/" ? "active" : "";
    const subscriptionsClass = location.pathname.match(/^\/subscriptions/) ? "active" : "";
    const notificationsClass = location.pathname.match(/^\/notifications/) ? "active" : "";
    const promotionsClass = location.pathname.match(/^\/promotions/) ? "active" : "";
    const navClass = collapsed ? "collapse" : "";

    return (
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" onClick={this.toggleCollapse.bind(this)} >
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
          </div>
          <div class={"navbar-collapse " + navClass} id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li class={loginClass}>
                <IndexLink to="/" onClick={this.toggleCollapse.bind(this)}>Login</IndexLink>
              </li>
              <li class={subscriptionsClass}>
                <Link to="subscriptions" onClick={this.toggleCollapse.bind(this)}>Subscriptions</Link>
              </li>
              <li class={notificationsClass}>
                <Link to="notifications" onClick={this.toggleCollapse.bind(this)}>Notifications</Link>
              </li>
              <li class={promotionsClass}>
                <Link to="promotions" onClick={this.toggleCollapse.bind(this)}>Promotions</Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    );
  }
}
