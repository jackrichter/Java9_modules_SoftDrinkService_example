module softdrink.extra.large {
    requires softdrink.api;

    provides softdrink.api.SoftDrinkService
            with softdrink.extra.large.ExtraLargeSoftDrinkService;
}