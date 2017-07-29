import React from "react";

export default class Login extends React.Component {
  render() {

   console.log("in Login Page");
    return (
        <div>
        {/* <div class="row">
        <div class="col-lg-12">
        <div class="well text-center">
        This is the Login Page
        </div>
        </div>
        </div> */}

          <div class="row">

          <div class="container">
            <div class="omb_login">
              <h3 class="omb_authTitle">Login or <a href="#">Sign up</a></h3>

              {/*  Social Buttons Start*/}
              <div class="row omb_row-sm-offset-3 omb_socialButtons">
                <div class="col-xs-4 col-sm-2">
                  <a href="#" class="btn btn-lg btn-block omb_btn-facebook">
                  <i class="fa fa-facebook visible-xs"></i>
                  <span class="hidden-xs">Facebook</span>
                  </a>
                </div>
                <div class="col-xs-4 col-sm-2">
                  <a href="#" class="btn btn-lg btn-block omb_btn-twitter">
                  <i class="fa fa-twitter visible-xs"></i>
                  <span class="hidden-xs">Twitter</span>
                  </a>
                </div>
                <div class="col-xs-4 col-sm-2">
                  <a href="#" class="btn btn-lg btn-block omb_btn-google">
                  <i class="fa fa-google-plus visible-xs"></i>
                  <span class="hidden-xs">Google+</span>
                  </a>
                </div>
              </div>

              {/*  Social Buttons div ends*/}


              <div class="row omb_row-sm-offset-3 omb_loginOr">
                <div class="col-xs-12 col-sm-6">
                  <hr class="omb_hrOr"/>
                  <span class="omb_spanOr">or</span>
                </div>
              </div>

              {/* login form starts  */}
              <div class="row omb_row-sm-offset-3">
                <div class="col-xs-12 col-sm-6">
                  <form class="omb_loginForm" action="" autocomplete="off" method="POST">
                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-user"></i></span>
                      <input type="text" class="form-control" name="username" placeholder="email address"/>
                    </div>
                      <span class="help-block"></span>

                    <div class="input-group">
                      <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                      <input  type="password" class="form-control" name="password" placeholder="Password"/>
                    </div>

                    <div class="input-group">
                      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
                  </div>
                  </form>
                </div>
              </div>

              {/*  login form ends */}

              <div class="row omb_row-sm-offset-3">
                <div class="col-xs-12 col-sm-3">
                  <label class="checkbox">
                  <input type="checkbox" value="remember-me"/>Remember Me
                  </label>
                </div>
                <div class="col-xs-12 col-sm-3">
                  <p class="omb_forgotPwd">
                  <a href="#">Forgot password?</a>
                  </p>
                </div>
              </div>

            </div>
          </div>


          </div>
        </div>
    );
  }
}
