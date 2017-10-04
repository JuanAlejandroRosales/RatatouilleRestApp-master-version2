package ratatouillerestapp.upc.edu.pe.ui.login;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginMvpPresenter<LoginMvpView, LoginMvpInteractor>> mPresenterProvider;

  public LoginActivity_MembersInjector(
      Provider<LoginMvpPresenter<LoginMvpView, LoginMvpInteractor>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<LoginMvpPresenter<LoginMvpView, LoginMvpInteractor>> mPresenterProvider) {
    return new LoginActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      LoginActivity instance,
      Provider<LoginMvpPresenter<LoginMvpView, LoginMvpInteractor>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
