$('.sl').slick({
    slidesToShow: 1,
    slidesToScroll: 1,
    fade: true,
    speed: 1500,
    autoplay: true,
    autoplaySpeed: 4000,
    arrows: false,
    asNavFor: '.sl2',
    waitForAnimate: false
});

$('.sl2').slick({
    slidesToShow: 7,
    arrows: false,
    centerMode: true,
    centerPadding:'40px',
    asNavFor: '.sl',
    focusOnSelect: true,
    waitForAnimate: false
});