module softdrink.medium {
    requires softdrink.api;

    provides softdrink.api.SoftDrinkService
            with softdrink.medium.MediumSoftDrinkService;
}