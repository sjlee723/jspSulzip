let $slideBox = $(".slide-box");
let $slideImgs = $(".slide-img");

// 슬라이드 박스 너비
let slideWidth = 754;

//슬라이드 이미지 수
let slideCnt = $slideImgs.length;

// 슬라이드 이미지 인덱스
let currentIdx = 1;

$slideBox.css("left", -(currentIdx * slideWidth));
checkEnd();
checkSize();

$(".next").on("click", function () {
  console.log("next");

  currentIdx++;
  console.log("currentIdx : " + currentIdx);
  $slideBox.css("transition", "0.5s");

  $slideBox.css("left", -(currentIdx * slideWidth));
  checkEnd();
  addTransition();
  checkSize();
});

$(".prev").on("click", function () {
  console.log("prev");

  currentIdx--;
  $slideBox.css("transition", "0.5s");
  $slideBox.css("left", -(currentIdx * slideWidth));
  checkEnd();
  addTransition();
  checkSize();
});

function checkEnd() {
  if (currentIdx <= 0) {
    $(".prev").css("display", "none");
  } else {
    $(".prev").css("display", "block");
  }

  if (currentIdx >= slideCnt - 1) {
    $(".next").css("display", "none");
  } else {
    $(".next").css("display", "block");
  }
}

function checkSize() {
  console.log($slideImgs.length);
  for (let i = 0; i < $slideImgs.length; i++) {
    if (i != currentIdx) {
      $slideImgs.eq(i).css("height", "300px");
    } else {
      $slideImgs.eq(i).css("height", "400px");
    }
  }
}

function addTransition() {
  for (let i = 0; i < $slideImgs.length; i++) {
    if (i != currentIdx) {
      $slideImgs.eq(i).css("transition", "0.2s");
    } else {
      $slideImgs.eq(i).css("transition", "0.2s");
    }
  }
}

// =========================================================
// main 배너 슬라이드

document.querySelector(".first").addEventListener("click", function () {
  document.querySelector(".main-img").style.transform = "";
});

document.querySelector(".second").addEventListener("click", function () {
  document.querySelector(".main-img").style.transform = "translate(-100vw)";
});

let idx = 0;
let isLast = false;
// 자동 슬라이드
// autoSlide();

function next() {
  $(".main-img").css("transition", "0.5s");
  $(".main-img").css("transform", `translate(${100 * idx * -1}vw)`);
  idx++;

  if (idx == 3) {
    idx = 1;
    setTimeout(() => {
      $(".main-img").css("transition", "none");
      $(".main-img").css("transform", `translate(0vw)`);
    }, 500);
  }
}

setInterval(next, 2000);
