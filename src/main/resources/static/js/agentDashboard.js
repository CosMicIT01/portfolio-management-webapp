$(document).ready(function () {
  $('a[data-toggle="tab"]').on('show.bs.tab', function (e) {
    var tab = $(e.target.attributes.href.nodeValue);
    $(tab).load(tab.data('url'));
  });

  $('.nav-tabs a:first').each(function() {
    $(this.attributes.href.nodeValue).load($(this.attributes.href.nodeValue).data('url'));
  });

  $(".iframe").colorbox({iframe:true, width:"80%", height:"80%"});

});