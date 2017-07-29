import React from "react";


export default class Notifications extends React.Component {
  render() {
    console.log("in Notifications component");
    const { query } = this.props.location;
    const { params } = this.props;
    const { date, filter } = query;

    return (
      <div>
        <div class="row">
          <div class="col-lg-12">
            <div class="well text-center">
              This is the Notifications Page
            </div>
          </div>
        </div>

        <div class="row">The Content Goes Here</div>
      </div>
    );
  }
}
