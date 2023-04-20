//주문정보
$(".order-info-title").click(() => {
  $(".togle1-img").toggleClass("toggle-arrow");
  $(".info-content").toggleClass("toggle-info-content");
  $(".info-content-box").toggleClass("toggle-box");
});

//결제정보
$(".payment-title").click(() => {
  $(".togle2-img").toggleClass("toggle-arrow");
  $(".payment-all").toggleClass("toggle-payment-all");
  $(".payment-all-box").toggleClass("toggle-box");
});

//무통장입금
$(".paying-type1").click(() => {
  $(".paying-content").toggleClass("toggle-paying-content");
  $(".paying-content-box").toggleClass("toggle-box-open");
  $(".bi-check-circle").toggleClass("check-circle-none");
  $(".bi-check-circle-fill").toggleClass("check-circle-none");
  if ($(".bi-check-circle").hasClass("check-circle-none")) {
    $("#radio-bank").prop("checked", true);
  } else {
    $("#radio-bank").prop("checked", false);
  }
  if ($(".bi-check-circle2").hasClass("check-circle-none")) {
    $(".bi-check-circle2").toggleClass("check-circle-none");
    $(".bi-check-circle-fill2").toggleClass("check-circle-none");
  }
});

//신용카드
$(".paying-type2").click(() => {
  $(".bi-check-circle2").toggleClass("check-circle-none");
  $(".bi-check-circle-fill2").toggleClass("check-circle-none");
  if ($(".bi-check-circle2").hasClass("check-circle-none")) {
    $("#radio-card").prop("checked", true);
  } else {
    $("#radio-card").prop("checked", false);
  }
  if ($(".bi-check-circle").hasClass("check-circle-none")) {
    $(".paying-content").toggleClass("toggle-paying-content");
    $(".paying-content-box").toggleClass("toggle-box-open");
    $(".bi-check-circle").toggleClass("check-circle-none");
    $(".bi-check-circle-fill").toggleClass("check-circle-none");
  }
});



















