module softdrink.large {
    requires softdrink.api;

    provides softdrink.api.SoftDrinkService
            with softdrink.large.LargeSoftDrinkService;
}