import React from "react";


export default class Customers extends React.Component {
  render() {
    console.log("in Customers component");
    const { query } = this.props.location;
    const { params } = this.props;
    const { date, filter } = query;

    return (
      <div>
        <div class="row">
          <div class="col-lg-12">
            <div class="well text-center">
              This is the Customer Page
            </div>
          </div>
        </div>

        <div class="row">The Content Goes Here</div>
      </div>
    );
  }
}
