import React from "react";
import ReactDOM from "react-dom";
import { Router, Route, IndexRoute, hashHistory } from "react-router";

import Layout from "./pages/Layout";
import Login from "./pages/Login";
import Subscriptions from "./pages/Subscriptions";
import Notifications from "./pages/Notifications";
import Promotions from "./pages/Promotions";

const app = document.getElementById('app');

ReactDOM.render(
  <Router history={hashHistory}>
    <Route path="/" component={Layout}>
      <IndexRoute component={Login}></IndexRoute>
      <Route path="subscriptions" name="subscriptions" component={Subscriptions}></Route>
      <Route path="notifications" name="notifications" component={Notifications}></Route>
      <Route path="promotions" name="promotions" component={Promotions}></Route>
    </Route>
  </Router>,
app);
