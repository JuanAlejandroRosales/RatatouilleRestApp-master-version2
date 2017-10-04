package ratatouillerestapp.upc.edu.pe.ui.main.rating;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RateUsDialog_MembersInjector implements MembersInjector<RateUsDialog> {
  private final Provider<RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
      mPresenterProvider;

  public RateUsDialog_MembersInjector(
      Provider<RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
          mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RateUsDialog> create(
      Provider<RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
          mPresenterProvider) {
    return new RateUsDialog_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RateUsDialog instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      RateUsDialog instance,
      Provider<RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
          mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
