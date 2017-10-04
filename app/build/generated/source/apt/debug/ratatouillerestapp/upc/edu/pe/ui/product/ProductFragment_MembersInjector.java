package ratatouillerestapp.upc.edu.pe.ui.product;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFragment_MembersInjector implements MembersInjector<ProductFragment> {
  private final Provider<ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>>
      mPresenterProvider;

  public ProductFragment_MembersInjector(
      Provider<ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ProductFragment> create(
      Provider<ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>> mPresenterProvider) {
    return new ProductFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ProductFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      ProductFragment instance,
      Provider<ProductMvpPresenter<ProductMvpView, ProductMvpInteractor>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
